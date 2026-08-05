package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.MissingReferenceProblem.class)
public class MissingReferenceProblem_703998762Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2089511020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089511020L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__431461214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431461214L))
            info.setReturnValue("xZN\u7D7B*KY5Mi-jJU9bv<q }Q``44\uD4D14x\u49F0X2\u9A72\u6111D),PT<pj og{(\u74A3H>Cs\u01D4KjK.@(6t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_742261503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742261503L))
            info.setReturnValue(-1266037882);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__431461710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431461710L))
            info.setReturnValue("3&}@Jnp@/(6T\u3806\u13185@K5#2>\u55A1U\u56A4dQ|XP`J\uCB4ALghk&R-/\u9F1F_S{pMNq_\u5C88iUyu@IH\uB2C1:DW05A\u9473ZOY#dobX_I");
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_1512490074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512490074L))
            info.setReturnValue(null);
    }


}
