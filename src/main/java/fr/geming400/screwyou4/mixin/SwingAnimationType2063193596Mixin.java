package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SwingAnimationType.class)
public class SwingAnimationType2063193596Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/SwingAnimationType;", cancellable = true)
    private static void values__1952592394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952592394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/SwingAnimationType;", cancellable = true)
    private static void valueOf_1911296463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911296463L))
            info.setReturnValue(net.minecraft.world.item.SwingAnimationType.WHACK);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_404870001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404870001L))
            info.setReturnValue(-1827999698);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__2143565078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143565078L))
            info.setReturnValue("EG!@^+H\u2B44l(n?mYBdL/\uCCC2\u4FADMWy|4Z(5");
    }


}
