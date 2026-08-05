package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementRequirements.class)
public class AdvancementRequirements_815940142Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_854202387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854202387L))
            info.setReturnValue(26189179);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2093514896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093514896L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__319520330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319520330L))
            info.setReturnValue("d%F*UI(K핂R%2}`円72q;e3^E,^{_c㙲%j[m2.⹉w1}N2AeࡇMm8!bo=S婜*WB;R(>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_854202883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854202883L))
            info.setReturnValue(-176958240);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void test_886300531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886300531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_854218724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854218724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "count(Ljava/util/function/Predicate;)I", cancellable = true)
    private void count_886284194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886284194L))
            info.setReturnValue(-1081309442);
    }

    @Inject(at = @At("HEAD"), method = "validate(Ljava/util/Set;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validate__495446639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495446639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_462447020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(462447020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "names()Ljava/util/Set;", cancellable = true)
    private void names__1013095345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013095345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/Collection;)Lnet/minecraft/advancements/AdvancementRequirements;", cancellable = true)
    private static void allOf_1902821754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902821754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/Collection;)Lnet/minecraft/advancements/AdvancementRequirements;", cancellable = true)
    private static void anyOf_1902821754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902821754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Ljava/util/List;", cancellable = true)
    private void requirements__1852690339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852690339L))
            info.setReturnValue(null);
    }


}
