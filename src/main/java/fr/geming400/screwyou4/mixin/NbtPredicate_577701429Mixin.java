package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.NbtPredicate.class)
public class NbtPredicate_577701429Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1963213687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963213687L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__557758547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557758547L))
            info.setReturnValue("DAYtWQG|n駂bB[V8]ngnd1D?or[[1/Kr^Bl>)ᯋ6<㨇6t뎘^D''y)Z'x7^쟧9-fAfO(S|e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_615964170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615964170L))
            info.setReturnValue(-1809605518);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches_125980612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125980612L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void matches_186024235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186024235L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches__1883614646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883614646L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void tag__992521492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992521492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityTagToCompare(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getEntityTagToCompare_194577917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194577917L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
