package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.CopyOnWriteFileSystem.Moves.class)
public class Moves_2107996610Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1199370341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199370341L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1416547162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1416547162L))
            info.setReturnValue("\uBD14\uBFA4GNuvhVy\uAA03\"ZA?9t!]!m`Q}7GvL>$\uBE8C\u9FCD\u974E\u81B6XKYA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1629618596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629618596L))
            info.setReturnValue(1208287055);
    }

    @Inject(at = @At("HEAD"), method = "preexistingFiles()Ljava/util/List;", cancellable = true)
    private void preexistingFiles_1770363738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770363738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directories()Ljava/util/List;", cancellable = true)
    private void directories_1822989372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822989372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copiedFiles()Ljava/util/List;", cancellable = true)
    private void copiedFiles__129528188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129528188L))
            info.setReturnValue(null);
    }


}
