package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementRequirements.class)
public class AdvancementRequirements_815940142Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1259671730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259671730L))
            info.setReturnValue(172298270);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__92686127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92686127L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1586363170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586363170L))
            info.setReturnValue("'5ak |c+G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1373292232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373292232L))
            info.setReturnValue(-994282804);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void test_803553697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803553697L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1875056513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875056513L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "count(Ljava/util/function/Predicate;)I", cancellable = true)
    private void count__1504248781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504248781L))
            info.setReturnValue(1655052005);
    }

    @Inject(at = @At("HEAD"), method = "validate(Ljava/util/Set;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validate__832899929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832899929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__613046517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-613046517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "names()Ljava/util/Set;", cancellable = true)
    private void names_1980790791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980790791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/Collection;)Lnet/minecraft/advancements/AdvancementRequirements;", cancellable = true)
    private static void allOf__1513625902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513625902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/Collection;)Lnet/minecraft/advancements/AdvancementRequirements;", cancellable = true)
    private static void anyOf_1767119133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767119133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Ljava/util/List;", cancellable = true)
    private void requirements__553585427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553585427L))
            info.setReturnValue(null);
    }


}
