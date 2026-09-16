package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.NbtPredicate.class)
public class NbtPredicate_577701429Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__330924840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330924840L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1348124953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348124953L))
            info.setReturnValue("8U\u6134Tj!M U\uFC12WULTsX_ f!N_HfK({!U?8,i0\u98B53eV\u74F1h)\u65F1E<'@?Yv;VV\uC83B=|J&<Hno#i<\"/;vc5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1135053519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135053519L))
            info.setReturnValue(-1676932502);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches__24352265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24352265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void matches_6819806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(6819806L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches_604515255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604515255L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void tag_374152466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374152466L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getEntityTagToCompare(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getEntityTagToCompare__1762595802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762595802L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
