package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.criteria.ObjectiveCriteria.class)
public class ObjectiveCriteria1320146890Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_184686419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184686419L))
            info.setReturnValue("\u3B47dYS\uD4E3\uBA92:;r*\uFECA#,70");
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1358425473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1358425473L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void byName__964784602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964784602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerCustom(Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private static void registerCustom_2064682379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064682379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerCustom(Ljava/lang/String;ZLnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private static void registerCustom_496832897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496832897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomCriteriaNames()Ljava/util/Set;", cancellable = true)
    private static void getCustomCriteriaNames__508888348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508888348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultRenderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void getDefaultRenderType__299423223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299423223L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.INTEGER);
    }


}
