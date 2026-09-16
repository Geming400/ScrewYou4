package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.class)
public class ChunkPalettedStorageFix1728616482Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lcom/mojang/serialization/Dynamic;)Ljava/lang/String;", cancellable = true)
    private static void getName_2023418918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023418918L))
            info.setReturnValue(")\u4FA8$%2rY(\u42C4^f!i[Jgyii$:&&=>f[59?;7;H,{\u96E6J\uAFA6#eN}Qk2Tvo_;M='I,)<gKF&AaG");
    }

    @Inject(at = @At("HEAD"), method = "getProperty(Lcom/mojang/serialization/Dynamic;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getProperty_1419411046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419411046L))
            info.setReturnValue("c\u2C83={W`Nmw*\u41F0d=x5X#g\"tT$Fxxpg*W!q5\uC5A0U1^\uB666C\u6E71.#\u2BACRT0[e0M\u938B-hCyp./\uC103\u415ATmop\u362F7WS9`[sn");
    }

    @Inject(at = @At("HEAD"), method = "idFor(Lnet/minecraft/util/CrudeIncrementalIntIdentityHashBiMap;Lcom/mojang/serialization/Dynamic;)I", cancellable = true)
    private static void idFor__1897633667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897633667L))
            info.setReturnValue(-620968414);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_912479763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912479763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSideMask(ZZZZ)I", cancellable = true)
    private static void getSideMask_1042654023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042654023L))
            info.setReturnValue(1743381674);
    }


}
