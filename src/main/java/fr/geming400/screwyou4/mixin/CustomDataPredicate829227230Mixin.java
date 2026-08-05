package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.CustomDataPredicate.class)
public class CustomDataPredicate829227230Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/advancements/predicates/NbtPredicate;", cancellable = true)
    private void value_1894136746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894136746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2080227807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080227807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__306232745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306232745L))
            info.setReturnValue("(<^櫗Ro.b㲡Dꪷwj'(E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_867489972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867489972L))
            info.setReturnValue(137861157);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches__1632088844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632088844L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "customData(Lnet/minecraft/advancements/predicates/NbtPredicate;)Lnet/minecraft/core/component/predicates/CustomDataPredicate;", cancellable = true)
    private static void customData_1154202960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154202960L))
            info.setReturnValue(null);
    }


}
