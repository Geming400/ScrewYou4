package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.MessageArgument.Message.class)
public class Message1321535249Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_412908981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412908981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2091958774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091958774L))
            info.setReturnValue("Yf\uCBC0Q`a/0 \u9B13OQh\u72BFG<\u708CCk+{(39\uAC15;<\u1DB5\u46EC CvUS#+H\u26DC1o!k $5o\u16D8) \u62CE8t)o#M\uF9C9@#FwBm/)=2WI$\u909E`\uC774\u3D729#\u0226Jx4u!-|18\u3C7CNb");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1878887340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878887340L))
            info.setReturnValue(-1236563741);
    }

    @Inject(at = @At("HEAD"), method = "parts()[Lnet/minecraft/commands/arguments/MessageArgument$Part;", cancellable = true)
    private void parts_1807816573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807816573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text__942425081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-942425081L))
            info.setReturnValue("=;v0x.{k]pp6(opboJ.\uCEBC");
    }

    @Inject(at = @At("HEAD"), method = "parseText(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/MessageArgument$Message;", cancellable = true)
    private static void parseText_1735517628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735517628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toComponent(Lnet/minecraft/commands/CommandSourceStack;Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent__1170606114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170606114L))
            info.setReturnValue(null);
    }


}
