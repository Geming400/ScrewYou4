package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.MessageArgument.Message.class)
public class Message1321535249Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1587919788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587919788L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_186075274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186075274L))
            info.setReturnValue("qg9A䦱ATU&wAૠkD;X^듷郋=)᧒l숂=PIfXmW;*aD,+=ᲈw+W&HF+愦;#'鬠9I텱v|m|ꗁiꦈ4:}Va9^&A]B牾p4%듯0[d㈓ᑩ27垻줈U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1359797991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359797991L))
            info.setReturnValue(1017458900);
    }

    @Inject(at = @At("HEAD"), method = "parts()[Lnet/minecraft/commands/arguments/MessageArgument$Part;", cancellable = true)
    private void parts_539987101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(539987101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text_186074778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186074778L))
            info.setReturnValue("즱y");
    }

    @Inject(at = @At("HEAD"), method = "parseText(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/MessageArgument$Message;", cancellable = true)
    private static void parseText__864468164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864468164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toComponent(Lnet/minecraft/commands/CommandSourceStack;Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent_2064293020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064293020L))
            info.setReturnValue(null);
    }


}
