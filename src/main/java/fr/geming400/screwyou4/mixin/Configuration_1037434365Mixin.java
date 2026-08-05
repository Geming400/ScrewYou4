package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.LakeFeature.Configuration.class)
public class Configuration_1037434365Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1872020673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872020673L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__98025611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98025611L))
            info.setReturnValue("GwmV{>[7%{u%u\"ffⱙ9FlQsOrBxL爚nG@6<=W⢍Bc뙸\"\".鋧r7?⩩QfmIUOFNloO懓䠁T⊴ofDEBV5\",Q&rpF_,@dJl-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1075697106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075697106L))
            info.setReturnValue(-1003981156);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void fluid__895272137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895272137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "barrier()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void barrier__895272137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895272137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceFeature()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceFeature_1070202953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070202953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReplaceWithAirOrFluid()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canReplaceWithAirOrFluid_1070202953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070202953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReplaceWithBarrier()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canReplaceWithBarrier_1070202953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070202953L))
            info.setReturnValue(null);
    }


}
