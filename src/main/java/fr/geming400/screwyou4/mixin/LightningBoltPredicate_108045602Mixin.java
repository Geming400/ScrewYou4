package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.LightningBoltPredicate.class)
public class LightningBoltPredicate_108045602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__800580667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800580667L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_878469126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878469126L))
            info.setReturnValue("B8@\",\uC6EAfhZzBs2\u1386Yi5,`\u5323s@w^ UWM=Y||uBYvziF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_665397692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665397692L))
            info.setReturnValue(-482887653);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1458354535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458354535L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entityStruck()Ljava/util/Optional;", cancellable = true)
    private void entityStruck_1635172190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635172190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockSetOnFire(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/LightningBoltPredicate;", cancellable = true)
    private static void blockSetOnFire_678124719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678124719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocksSetOnFire()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void blocksSetOnFire_231549950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231549950L))
            info.setReturnValue(null);
    }


}
