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
            info.setReturnValue("xZN絻*KY5Mi-jJU9bv<q }Q``44퓑4x䧰X2驲愑D),PT<pj og{(璣H>CsǔKjK.@(6t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_742261503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742261503L))
            info.setReturnValue(-1651581382);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__431461710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431461710L))
            info.setReturnValue("3&}@Jnp@/(6T㠆ጘ5@K5#2>喡U嚤dQ|XP`J쭊Lghk&R-/鼟_S{pMNq_岈iUyu@IH닁:DW05A鑳ZOY#dobX_I");
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_1512490074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512490074L))
            info.setReturnValue(null);
    }


}
