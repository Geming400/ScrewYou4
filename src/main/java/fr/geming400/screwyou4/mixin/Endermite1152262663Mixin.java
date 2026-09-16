package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Endermite.class)
public class Endermite1152262663Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1022579005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1022579005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1511407066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511407066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1767602643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767602643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setYBodyRot(F)V", cancellable = true)
    private void setYBodyRot__100873010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-100873010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkEndermiteSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkEndermiteSpawnRules_2018628816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018628816L))
            info.setReturnValue(true);
    }


}
