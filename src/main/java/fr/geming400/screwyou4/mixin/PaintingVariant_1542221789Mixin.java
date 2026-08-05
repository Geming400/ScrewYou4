package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.painting.PaintingVariant.class)
public class PaintingVariant_1542221789Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_633595520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633595520L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1982321983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982321983L))
            info.setReturnValue("C55T'9Flj(x\u9985\u1929[f\"d.K%Y\u4987[5=dI=D3oZbV\u1D6Bog>A8!a=rv\u1F96IK<\u582E4Q\uA421d#!\u689B\u3CDCq<\u9A9B#vKND\u0EA87d6\u7182_w)+\u65C1@K%\u26C5\uD355`h&\u6C69\uCD9Aw/K#E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2099573879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099573879L))
            info.setReturnValue(253435123);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__97926212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97926212L))
            info.setReturnValue(2031306526);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/util/Optional;", cancellable = true)
    private void title__805930014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805930014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "author()Ljava/util/Optional;", cancellable = true)
    private void author__1612590571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612590571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__405052338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405052338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "area()I", cancellable = true)
    private void area_1388561749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388561749L))
            info.setReturnValue(-280005154);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_456873211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456873211L))
            info.setReturnValue(1136861721);
    }


}
