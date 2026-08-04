package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.searchtree.SuffixArray.class)
public class SuffixArray1659241722Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;Ljava/lang/String;)V", cancellable = true)
    private void add_1385635411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1385635411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "search(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void search_964002272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964002272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generate()V", cancellable = true)
    private void generate_1697516461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1697516461L))
            info.cancel();
    }


}
