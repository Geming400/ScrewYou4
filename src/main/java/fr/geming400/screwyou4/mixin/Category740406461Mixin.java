package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.KeyMapping.Category.class)
public class Category740406461Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__168219807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168219807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1510829986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510829986L))
            info.setReturnValue(":Pk%A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1297758552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297758552L))
            info.setReturnValue(805272390);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/KeyMapping$Category;", cancellable = true)
    private static void register_1837862331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837862331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1852371425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852371425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_1352680260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352680260L))
            info.setReturnValue(null);
    }


}
