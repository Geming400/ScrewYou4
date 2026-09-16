package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.StringReaderParserState.class)
public class StringReaderParserState_131913488Mixin {
        @Inject(at = @At("HEAD"), method = "input()Ljava/lang/Object;", cancellable = true)
    private void input_1688393908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688393908L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "input()Lcom/mojang/brigadier/StringReader;", cancellable = true)
    private void input_147213564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(147213564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mark()I", cancellable = true)
    private void mark__860430776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860430776L))
            info.setReturnValue(-154387809);
    }

    @Inject(at = @At("HEAD"), method = "restore(I)V", cancellable = true)
    private void restore__1905136055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1905136055L))
            info.cancel();
    }


}
