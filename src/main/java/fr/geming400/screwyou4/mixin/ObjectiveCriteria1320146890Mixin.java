package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.criteria.ObjectiveCriteria.class)
public class ObjectiveCriteria1320146890Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__568700012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568700012L))
            info.setReturnValue("@lSy/#\uA5440r\u81B2t\u0548ZdX");
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1819885397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1819885397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void byName__140704984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-140704984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultRenderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void getDefaultRenderType__1091565532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091565532L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.INTEGER);
    }

    @Inject(at = @At("HEAD"), method = "registerCustom(Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private static void registerCustom_249027095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249027095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerCustom(Ljava/lang/String;ZLnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private static void registerCustom_193481077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(193481077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomCriteriaNames()Ljava/util/Set;", cancellable = true)
    private static void getCustomCriteriaNames__864027742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864027742L))
            info.setReturnValue(null);
    }


}
