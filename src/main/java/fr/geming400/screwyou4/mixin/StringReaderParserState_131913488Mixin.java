package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.StringReaderParserState.class)
public class StringReaderParserState_131913488Mixin {
        @Inject(at = @At("HEAD"), method = "input()Ljava/lang/Object;", cancellable = true)
    private void input_1991234666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991234666L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "input()Lcom/mojang/brigadier/StringReader;", cancellable = true)
    private void input__1733987322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733987322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mark()I", cancellable = true)
    private void mark_170175733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170175733L))
            info.setReturnValue(-987437856);
    }

    @Inject(at = @At("HEAD"), method = "restore(I)V", cancellable = true)
    private void restore_1345830459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1345830459L))
            info.cancel();
    }


}
