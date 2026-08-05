package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFileSystem.Moves.class)
public class Moves_2107996610Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__801458428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801458428L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_972536634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972536634L))
            info.setReturnValue("g_PeP5^x6!,73mm\u4A78;\u811An8:\"`V[U<N/g:\u352B>:w\u6C28br,Y\u0CAF8aK2\u583Ef&/D`;iKi].?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2146259351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146259351L))
            info.setReturnValue(-1808384451);
    }

    @Inject(at = @At("HEAD"), method = "preexistingFiles()Ljava/util/List;", cancellable = true)
    private void preexistingFiles__560633871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560633871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directories()Ljava/util/List;", cancellable = true)
    private void directories__560633871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560633871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copiedFiles()Ljava/util/List;", cancellable = true)
    private void copiedFiles__560633871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560633871L))
            info.setReturnValue(null);
    }


}
