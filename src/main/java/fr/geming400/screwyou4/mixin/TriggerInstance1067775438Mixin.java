package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.AnyBlockInteractionTrigger.TriggerInstance.class)
public class TriggerInstance1067775438Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_159149170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159149170L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1838198963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838198963L))
            info.setReturnValue("\u1FB19Jng!TMY.?q6>k5!#IsK@;Y\u95F9e<\"*?E\u7763f4%eBujY@SNhe0hFB)Q\uC96F%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1625127529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625127529L))
            info.setReturnValue(-1488981889);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1781844625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781844625L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1327948544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1327948544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "location()Ljava/util/Optional;", cancellable = true)
    private void location__124815311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124815311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__162877603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162877603L))
            info.setReturnValue(null);
    }


}
