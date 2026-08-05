package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.CuredZombieVillagerTrigger.TriggerInstance.class)
public class TriggerInstance_284184044Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1669696302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669696302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__851275932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851275932L))
            info.setReturnValue("+5\u6B8BQ`x)99aPMRl7yi#vAHco\u95CC5pJ\u6B624if7??\u4E15,/?L^,k3_z\u373A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_322446785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322446785L))
            info.setReturnValue(1415825799);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_25172960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25172960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1855756685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1855756685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_529645465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529645465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zombie()Ljava/util/Optional;", cancellable = true)
    private void zombie_529645465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529645465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "curedZombieVillager()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void curedZombieVillager_1557935442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557935442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villager()Ljava/util/Optional;", cancellable = true)
    private void villager_529645465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529645465L))
            info.setReturnValue(null);
    }


}
