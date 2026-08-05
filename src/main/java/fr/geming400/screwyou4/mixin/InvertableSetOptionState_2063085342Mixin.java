package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.options.InvertableSetOptionState.class)
public class InvertableSetOptionState_2063085342Mixin {
        @Inject(at = @At("HEAD"), method = "markParsedElement(Z)V", cancellable = true)
    private void markParsedElement__1002265126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1002265126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canParsePositiveElement()Z", cancellable = true)
    private void canParsePositiveElement_2101363924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101363924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canParseNegativeElement()Z", cancellable = true)
    private void canParseNegativeElement_2101363924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101363924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canParseElement(Z)Z", cancellable = true)
    private void canParseElement__1002261282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002261282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canParseAnyTag()Z", cancellable = true)
    private void canParseAnyTag_2101363924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101363924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canParseTag(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void canParseTag_568648028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568648028L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "markParsedTag(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void markParsedTag_568644184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(568644184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canParseAny()Z", cancellable = true)
    private void canParseAny_2101363924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101363924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "markParsedNegativeElement()V", cancellable = true)
    private void markParsedNegativeElement_2101360080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2101360080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markParsedPositiveElement()V", cancellable = true)
    private void markParsedPositiveElement_2101360080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2101360080L))
            info.cancel();
    }


}
