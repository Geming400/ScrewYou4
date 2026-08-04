package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelBakery.BakingResult.class)
public class BakingResult_255433802Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1640946060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640946060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__880026174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880026174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_293696543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293696543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemProperties()Ljava/util/Map;", cancellable = true)
    private void itemProperties__1749189839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749189839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingModels()Lnet/minecraft/client/resources/model/ModelBakery$MissingModels;", cancellable = true)
    private void missingModels__394313566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394313566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockStateModel(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void getBlockStateModel_498298746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498298746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateModels()Ljava/util/Map;", cancellable = true)
    private void blockStateModels__1749189839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749189839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStackModels()Ljava/util/Map;", cancellable = true)
    private void itemStackModels__1749189839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749189839L))
            info.setReturnValue(null);
    }


}
