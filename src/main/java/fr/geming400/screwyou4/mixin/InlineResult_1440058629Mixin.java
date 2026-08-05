package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.InlineResult.class)
public class InlineResult_1440058629Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__995716449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995716449L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1469396409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469396409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_304598653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304598653L))
            info.setReturnValue("X㔞p)1+RG};2TQ6KLfw6|]춾2쒝㰁A[Imu|EJl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1478321370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478321370L))
            info.setReturnValue(1663123585);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/ImmutableStringReader;Lnet/minecraft/core/HolderLookup$Provider;Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void parse__2077015195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077015195L))
            info.setReturnValue(null);
    }


}
