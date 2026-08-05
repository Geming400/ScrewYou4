package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityNbtPredicate.class)
public class EntityNbtPredicate_386854080Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1772366338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772366338L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__748605896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748605896L))
            info.setReturnValue("J_z'=GdUx:R篬dAvxGqVrGV겂ퟯoF_{q쨧L晴whc6ob㇝HKNBKAOj<ksy]0ᓉ欤n^欿Z筮厶@쏛G-姶#9/69");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_425116821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425116821L))
            info.setReturnValue(2083595599);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1567337832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567337832L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/advancements/predicates/NbtPredicate;", cancellable = true)
    private void nbt_1451763595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451763595L))
            info.setReturnValue(null);
    }


}
