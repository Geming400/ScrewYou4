package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.IdMapper.class)
public class IdMapper_6812280Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_45074525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45074525L))
            info.setReturnValue(-1897760335);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)V", cancellable = true)
    private void add_1392320198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1392320198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__2144803753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144803753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(I)Z", cancellable = true)
    private void contains_1220733095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220733095L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId_1392307705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392307705L))
            info.setReturnValue(1384067843);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId_1580595881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580595881L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "addMapping(Ljava/lang/Object;I)V", cancellable = true)
    private void addMapping_35284871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35284871L))
            info.cancel();
    }


}
