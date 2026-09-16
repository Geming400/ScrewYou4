package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.PackReloadConfig.IdAndPath.class)
public class IdAndPath898756669Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__9869599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9869599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1669180194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669180194L))
            info.setReturnValue("\uFD10gzrz21)\u4162|_\u061A#C0VK(3\u2173@NxB\u132EybqSGNSL\"|riVr =yo\u07767L(J/e7syyo\u5EDAO\u2E9C'FB} $n\u7A81\uD1E3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1456108760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1456108760L))
            info.setReturnValue(-355919905);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1722600427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722600427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path__1892126400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892126400L))
            info.setReturnValue(null);
    }


}
