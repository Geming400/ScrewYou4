package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Maybe.class)
public class Maybe1297395758Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_388769490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388769490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2067819283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067819283L))
            info.setReturnValue("uA\u5909p\u2AF8\u180CscL\uC804G\u9A5E->;|Up,PJn\uD248pT1D&nt8Uy2\uAE13rUS^\uFA39i%\uFCD8G4-!\u46AD4;o=|\u6A7E\u0501\"%U\u6CAEvw.xG\u5F86?lxMF-\u00EFr^J\uFAC8`*t3x6ZxAS#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1854747849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854747849L))
            info.setReturnValue(-1333123814);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_1093592921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093592921L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "term()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void term_1325724831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325724831L))
            info.setReturnValue(null);
    }


}
