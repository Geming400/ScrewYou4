package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.CuredZombieVillagerTrigger.TriggerInstance.class)
public class TriggerInstance_284184044Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__624442225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624442225L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1054607568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054607568L))
            info.setReturnValue("rT9mE_,=}[tv'\uA05B&\u2860\u630C`/>c\u81C1=d\u8CF7*eHS,b>QC4y)mS\uD1A56i=Ax/\uAD23\u4857}n;\u2B55bH:)]Q\u1CE8s=@{kNo\u89B0x\uC017w8Nix=6C@},9\u3D83^2!:T#v90\u4F7B35\uA2E8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_841536134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841536134L))
            info.setReturnValue(-891575239);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1329168781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329168781L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_544357149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(544357149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "zombie()Ljava/util/Optional;", cancellable = true)
    private void zombie__1095130177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095130177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "curedZombieVillager()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void curedZombieVillager_3903783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3903783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__946468998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946468998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villager()Ljava/util/Optional;", cancellable = true)
    private void villager_384286431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384286431L))
            info.setReturnValue(null);
    }


}
