package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LootTableTrigger.TriggerInstance.class)
public class TriggerInstance1634826041Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_726199773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726199773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1889717730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889717730L))
            info.setReturnValue("MP8!S J5no\u6BBEoC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2102789164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102789164L))
            info.setReturnValue(-1466920407);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void matches__913474841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913474841L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void lootTable_1329635620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329635620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTableUsed(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void lootTableUsed__789727737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789727737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_404173000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404173000L))
            info.setReturnValue(null);
    }


}
