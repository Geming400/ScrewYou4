package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.options.InvertableSetOptionState.class)
public class InvertableSetOptionState_2063085342Mixin {
        @Inject(at = @At("HEAD"), method = "markParsedPositiveElement()V", cancellable = true)
    private void markParsedPositiveElement__242147509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-242147509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markParsedNegativeElement()V", cancellable = true)
    private void markParsedNegativeElement_1568675719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1568675719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canParseAny()Z", cancellable = true)
    private void canParseAny__1195107253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195107253L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canParseTag(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void canParseTag_2074607461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074607461L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canParseAnyTag()Z", cancellable = true)
    private void canParseAnyTag_565279427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565279427L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canParsePositiveElement()Z", cancellable = true)
    private void canParsePositiveElement_2033984852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033984852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "markParsedElement(Z)V", cancellable = true)
    private void markParsedElement__745989320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-745989320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markParsedTag(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void markParsedTag__1564444580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1564444580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canParseElement(Z)Z", cancellable = true)
    private void canParseElement_365027031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365027031L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canParseNegativeElement()Z", cancellable = true)
    private void canParseNegativeElement__450159216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450159216L))
            info.setReturnValue(false);
    }


}
