package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentExactPredicate.class)
public class DataComponentExactPredicate1934824685Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__974630848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974630848L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_799364214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799364214L))
            info.setReturnValue("W蕰(K/Z:#g8/&14f]X့w7]眦Zj9^Ku7@%4턠BOP[]\"zZ:BL썆6qsgJ nMꔲLu!o=>F7nwwodj5uq6+J$텎");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1973086931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973086931L))
            info.setReturnValue(-848382678);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__974501888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974501888L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void test__526491389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526491389L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1973103268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973103268L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/core/component/DataComponentExactPredicate$Builder;", cancellable = true)
    private static void builder_713450303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713450303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Lnet/minecraft/core/component/DataComponentMap;)Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private static void allOf__1016857258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016857258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private static void expect_458722826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458722826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPatch()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void asPatch_209650062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209650062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysMatches()Z", cancellable = true)
    private void alwaysMatches_1973103268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973103268L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "someOf(Lnet/minecraft/core/component/DataComponentMap;[Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private static void someOf_428405915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428405915L))
            info.setReturnValue(null);
    }


}
