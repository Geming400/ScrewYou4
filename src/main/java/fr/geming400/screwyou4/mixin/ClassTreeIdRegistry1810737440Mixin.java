package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ClassTreeIdRegistry.class)
public class ClassTreeIdRegistry1810737440Mixin {
        @Inject(at = @At("HEAD"), method = "getCount(Ljava/lang/Class;)I", cancellable = true)
    private void getCount_894756306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894756306L))
            info.setReturnValue(1689769751);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Class;)I", cancellable = true)
    private void define__1757744460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757744460L))
            info.setReturnValue(409025849);
    }

    @Inject(at = @At("HEAD"), method = "getLastIdFor(Ljava/lang/Class;)I", cancellable = true)
    private void getLastIdFor_47506363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47506363L))
            info.setReturnValue(420028076);
    }


}
