package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FullConfig.class)
public class FullConfig_1629517843Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1279937195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279937195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_494057867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494057867L))
            info.setReturnValue("Ꮖ6xNz構p*/R=e2|mF`3휇|2-{Wsmy玸9KRIKN}^Jf簗?{Xx`Q:3jbV9;abT|p䭄GH-,qr`␅Vghwz83[@]㜴");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1667780584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667780584L))
            info.setReturnValue(1243608653);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lnet/minecraft/core/Holder;", cancellable = true)
    private void normal__1116573682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116573682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ominous()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ominous__1116573682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116573682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredPlayerRange()I", cancellable = true)
    private void requiredPlayerRange_1667780088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667780088L))
            info.setReturnValue(1446756072);
    }

    @Inject(at = @At("HEAD"), method = "targetCooldownLength()I", cancellable = true)
    private void targetCooldownLength_1667780088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667780088L))
            info.setReturnValue(1446756072);
    }

    @Inject(at = @At("HEAD"), method = "overrideEntity(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FullConfig;", cancellable = true)
    private void overrideEntity__169331263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169331263L))
            info.setReturnValue(null);
    }


}
