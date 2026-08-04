package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChanneledLightningTrigger.TriggerInstance.class)
public class TriggerInstance_928296477Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1981158561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981158561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__207163499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207163499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_966559218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966559218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Collection;)Z", cancellable = true)
    private void matches__1915346044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915346044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1211644252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1211644252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channeledLightning([Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void channeledLightning__1420373325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420373325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1173757898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173757898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "victims()Ljava/util/List;", cancellable = true)
    private void victims__1740334004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740334004L))
            info.setReturnValue(null);
    }


}
