package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.VillagerGoalPackages.class)
public class VillagerGoalPackages1172181438Mixin {
        @Inject(at = @At("HEAD"), method = "getMeetPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getMeetPackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getPlayPackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRestPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getRestPackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHidePackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getHidePackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIdlePackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getIdlePackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRaidPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getRaidPackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCorePackage(Lnet/minecraft/core/Holder;F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getCorePackage_453485730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453485730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorkPackage(Lnet/minecraft/core/Holder;F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getWorkPackage_453485730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453485730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPanicPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getPanicPackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreRaidPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getPreRaidPackage__1726865519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726865519L))
            info.setReturnValue(null);
    }


}
