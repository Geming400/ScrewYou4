package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemIdFix.class)
public class ItemIdFix_826120455Mixin {
        @Inject(at = @At("HEAD"), method = "getItem(I)Ljava/lang/String;", cancellable = true)
    private static void getItem_798100613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798100613L))
            info.setReturnValue("\u84F1L\u3007#Hcp5HUP}Q;:Iq|l7dn`1<1q-9\u4AC7\u0309pZFO<Kh#YLb\uBBA5W3j>$DX^9l;6\uC300[,\u883D'J[\u1A09qElD<3`\u7CF8|T\uA5C6^pq");
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_9983735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9983735L))
            info.setReturnValue(null);
    }


}
