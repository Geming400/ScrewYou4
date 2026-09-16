package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerModelPart.class)
public class PlayerModelPart_2059330499Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_1551267350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551267350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/player/PlayerModelPart;", cancellable = true)
    private static void values__1084920641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084920641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/player/PlayerModelPart;", cancellable = true)
    private static void valueOf_1271769560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271769560L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelPart.RIGHT_PANTS_LEG);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1088345188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088345188L))
            info.setReturnValue("0=V\u2103");
    }

    @Inject(at = @At("HEAD"), method = "getMask()I", cancellable = true)
    private void getMask_1944885126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944885126L))
            info.setReturnValue(1263150241);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__2147428176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147428176L))
            info.setReturnValue("]g-Xi[!gsv Da=oo27_S)\u4CFA8lsmX,-@9$kzdZBHzPp(MnJ\"az\u522F\u3C506}em\u6588Uqu,A}ymtx`\u6515\uC5C2{Ta");
    }

    @Inject(at = @At("HEAD"), method = "getBit()I", cancellable = true)
    private void getBit_896834097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896834097L))
            info.setReturnValue(1158546155);
    }


}
