package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.StyleArgument.class)
public class StyleArgument72678048Mixin {
        @Inject(at = @At("HEAD"), method = "style(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/StyleArgument;", cancellable = true)
    private static void style_216805087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216805087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1797292047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797292047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStyle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private static void getStyle__1179050728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1179050728L))
            info.setReturnValue(null);
    }


}
