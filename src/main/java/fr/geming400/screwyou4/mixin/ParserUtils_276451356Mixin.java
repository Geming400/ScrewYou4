package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.ParserUtils.class)
public class ParserUtils_276451356Mixin {
        @Inject(at = @At("HEAD"), method = "readWhile(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/CharPredicate;)Ljava/lang/String;", cancellable = true)
    private static void readWhile__1462775524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462775524L))
            info.setReturnValue("zkI6j9e폷sOstpk-wP뮀,N;Oz)+nrV[y'M  %KصP|*}Ogj!`OM9[Lfr=E쯑A^G&%");
    }


}
