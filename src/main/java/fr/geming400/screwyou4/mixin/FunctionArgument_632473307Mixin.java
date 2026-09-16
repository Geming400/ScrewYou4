package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.FunctionArgument.class)
public class FunctionArgument_632473307Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1593733400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593733400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/item/FunctionArgument$Result;", cancellable = true)
    private void parse_1428677535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428677535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "functions()Lnet/minecraft/commands/arguments/item/FunctionArgument;", cancellable = true)
    private static void functions_1467778326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467778326L))
            info.setReturnValue(new net.minecraft.commands.arguments.item.FunctionArgument());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1937879991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937879991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctions(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getFunctions__1310044487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310044487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionOrTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private static void getFunctionOrTag_1456234945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1456234945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionCollection(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private static void getFunctionCollection__751751996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751751996L))
            info.setReturnValue(null);
    }


}
