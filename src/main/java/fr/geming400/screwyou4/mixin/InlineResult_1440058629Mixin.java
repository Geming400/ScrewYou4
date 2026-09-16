package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.InlineResult.class)
public class InlineResult_1440058629Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_436537680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436537680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_531432360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531432360L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2084485143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084485143L))
            info.setReturnValue("_/\uB293](\u83B6B\u97D6v'15g\u6A4F/&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1997410719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997410719L))
            info.setReturnValue(-2124328538);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/ImmutableStringReader;Lnet/minecraft/core/HolderLookup$Provider;Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void parse__484964776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484964776L))
            info.setReturnValue(null);
    }


}
