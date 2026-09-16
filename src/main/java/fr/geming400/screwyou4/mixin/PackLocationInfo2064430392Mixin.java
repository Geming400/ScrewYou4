package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PackLocationInfo.class)
public class PackLocationInfo2064430392Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1155804124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155804124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1460113379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460113379L))
            info.setReturnValue("S\uC20BJ{CV\u88C2EOxRi$\u29D8\uB08FO3C9Db\u211B\u7CE4pmGjMH1!I\u45F8LpKK5dvpGl4Va}iBaHe\u6D16yG%x0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1673184813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673184813L))
            info.setReturnValue(76641720);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__1889375332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889375332L))
            info.setReturnValue("SI'zwe<u{m\u2589'[i4Oi>4e[n\u28FB!3)p1q.9}z`\uA509\"/u1Kc|\u260C{0Jot/3ybAIJ5\u6766ya-XrpP}AY\u0402\u7266%d%fp5f\u888F\u74E6");
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/server/packs/repository/PackSource;", cancellable = true)
    private void source__1985202827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985202827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title_101935651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101935651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPackInfo()Ljava/util/Optional;", cancellable = true)
    private void knownPackInfo_618357680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618357680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChatLink(ZLnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void createChatLink_639592479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639592479L))
            info.setReturnValue(null);
    }


}
