package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundCommandSuggestionPacket.class)
public class ServerboundCommandSuggestionPacket2143288766Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_464263678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464263678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__2113416284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113416284L))
            info.setReturnValue(-1114081360);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1473609617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1473609617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_274666772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(274666772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommand()Ljava/lang/String;", cancellable = true)
    private void getCommand_1007828295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007828295L))
            info.setReturnValue("U\"[3\uAD2867\uAFACgjZ/\u274CYV_[zo)1y4S1(V\u9092'[rDu$[Rq<<Go\uF94Eb\u03FA5z>g`S^]u\u3D83\u3F31|@");
    }


}
