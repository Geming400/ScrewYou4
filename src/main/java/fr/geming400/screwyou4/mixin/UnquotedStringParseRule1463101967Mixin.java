package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.UnquotedStringParseRule.class)
public class UnquotedStringParseRule1463101967Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/String;", cancellable = true)
    private void parse__478589433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478589433L))
            info.setReturnValue("iiuDFtzy\u2EBE2gW\u66D3q\uC822%X?BtZ'C)QC<\":Wu");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse__1778775079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778775079L))
            info.setReturnValue(new java.lang.Object());
    }


}
