package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.FunctionArgument.class)
public class FunctionArgument_632473307Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_339091563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339091563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/item/FunctionArgument$Result;", cancellable = true)
    private void parse_149126956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149126956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functions()Lnet/minecraft/commands/arguments/item/FunctionArgument;", cancellable = true)
    private static void functions_331468795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331468795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctions(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getFunctions__1840528386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840528386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionOrTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private static void getFunctionOrTag_825126968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825126968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCollection(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private static void getFunctionCollection_825126968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825126968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1181174966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1181174966L))
            info.setReturnValue(null);
    }


}
