package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.VillagerGoalPackages.class)
public class VillagerGoalPackages1172181438Mixin {
        @Inject(at = @At("HEAD"), method = "getPreRaidPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getPreRaidPackage_834479360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834479360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIdlePackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getIdlePackage_1939311405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939311405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorkPackage(Lnet/minecraft/core/Holder;F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getWorkPackage_1881267395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881267395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getPlayPackage__941843507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941843507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPanicPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getPanicPackage_2013224726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013224726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRaidPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getRaidPackage_739271991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739271991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMeetPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getMeetPackage_1902909594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902909594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCorePackage(Lnet/minecraft/core/Holder;F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getCorePackage__1923712687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923712687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHidePackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getHidePackage_158365311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158365311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRestPackage(F)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void getRestPackage_1877798701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877798701L))
            info.setReturnValue(null);
    }


}
