package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.IdMapper.class)
public class IdMapper_6812280Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_450543868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450543868L))
            info.setReturnValue(-117914096);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)V", cancellable = true)
    private void add_433029381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(433029381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator_1640891077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640891077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(I)Z", cancellable = true)
    private void contains__1738470522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738470522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId__856821816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856821816L))
            info.setReturnValue(-1992631321);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId_1364750999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364750999L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "addMapping(Ljava/lang/Object;I)V", cancellable = true)
    private void addMapping__47505036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-47505036L))
            info.cancel();
    }


}
