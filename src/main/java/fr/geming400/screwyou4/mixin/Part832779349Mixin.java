package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.MessageArgument.Part.class)
public class Part832779349Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2076675688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076675688L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__302680626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302680626L))
            info.setReturnValue("y)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_871042091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871042091L))
            info.setReturnValue(-2091460423);
    }

    @Inject(at = @At("HEAD"), method = "end()I", cancellable = true)
    private void end_871041595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871041595L))
            info.setReturnValue(-1888313004);
    }

    @Inject(at = @At("HEAD"), method = "start()I", cancellable = true)
    private void start_871041595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871041595L))
            info.setReturnValue(-1888313004);
    }

    @Inject(at = @At("HEAD"), method = "selector()Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void selector_460089789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460089789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toComponent(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent__39817754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-39817754L))
            info.setReturnValue(null);
    }


}
