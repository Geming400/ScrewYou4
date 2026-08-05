package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelBakery.BakingResult.class)
public class BakingResult_255433802Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__653192467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653192467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1025857326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025857326L))
            info.setReturnValue("bLyVMP=|\uFB35\u79D1av<1!<9SCD8y9L:uw|k>Y/%P>l\u4FC2j}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_812785892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812785892L))
            info.setReturnValue(446733461);
    }

    @Inject(at = @At("HEAD"), method = "getBlockStateModel(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void getBlockStateModel_1462050121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462050121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingModels()Lnet/minecraft/client/resources/model/ModelBakery$MissingModels;", cancellable = true)
    private void missingModels__1417004014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417004014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemProperties()Ljava/util/Map;", cancellable = true)
    private void itemProperties_1960383691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960383691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStackModels()Ljava/util/Map;", cancellable = true)
    private void itemStackModels__456114478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456114478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateModels()Ljava/util/Map;", cancellable = true)
    private void blockStateModels_252338403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252338403L))
            info.setReturnValue(null);
    }


}
