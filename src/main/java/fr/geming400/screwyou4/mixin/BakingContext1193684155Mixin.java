package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.BlockModel.BakingContext.class)
public class BakingContext1193684155Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1715770882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715770882L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_58224180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58224180L))
            info.setReturnValue("nl9+^p칽(3_?7+=8}d<蠮X>ds;7m)^_郠#ࠏK(俦7e2I@yw,>X;v6*{X&⩥X>G*昕+iu}1쓔3n^i){:doA]!)fzGzdC.><`{|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1231946897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231946897L))
            info.setReturnValue(-1436328171);
    }

    @Inject(at = @At("HEAD"), method = "entityModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void entityModelSet__590759792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590759792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingBlockModel()Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void missingBlockModel_1715113705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715113705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelGetter()Ljava/util/function/Function;", cancellable = true)
    private void modelGetter__732488592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732488592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__2066600211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066600211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void sprites__2056115313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056115313L))
            info.setReturnValue(null);
    }


}
